package io.github.bluething.playground.codinginterview.loop;

import java.util.ArrayList;
import java.util.List;

public class PageLayout {

    private static int maxArea;
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int testCase;
        List<Story> stories;
        List<Story> takenStories;
        while ((testCase = io.getInt()) != 0) {
            stories = new ArrayList<>();
            for (int i = 0; i < testCase; i++) {
                stories.add(new Story(io.getInt(),
                        io.getInt(),
                        io.getInt(),
                        io.getInt()));
            }
            takenStories = new ArrayList<>();
            maxArea = 0;
            solve(0, stories, takenStories);

            System.out.println(maxArea);
        }

        io.close();
    }

    private static void solve(int i, List<Story> stories, List<Story> takenStories) {
        if (i == stories.size()) {
            int sumArea = 0;
            for (Story takenStory : takenStories) {
                sumArea += takenStory.getArea();
            }
            maxArea = Math.max(maxArea, sumArea);

            return;
        }

        Story story = stories.get(i);
        boolean isTaken = true;
        boolean right;
        boolean left;
        boolean above;
        boolean below;
        for (Story takenStory : takenStories) {
            right = story.getX() >= takenStory.getX() + takenStory.getW();
            left = story.getX() + story.getW() <= takenStory.getX();
            above = story.getY() + story.getH() <= takenStory.getY();
            below = story.getY() >= takenStory.getY() + takenStory.getH();

            if (!right && !left && !above && !below) {
                isTaken = false;
                break;
            }
        }

        if (isTaken) {
            takenStories.add(story);
            solve(i+1, stories, takenStories);
            takenStories.remove(takenStories.size()-1);
        }

        solve(i+1, stories, takenStories);

    }
}

class Story {
    private final int x;
    private final int y;
    private final int w;
    private final int h;
    private final int area;

    public Story(int w, int h, int x, int y) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.area = w * h;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }

    public int getArea() {
        return area;
    }
}
