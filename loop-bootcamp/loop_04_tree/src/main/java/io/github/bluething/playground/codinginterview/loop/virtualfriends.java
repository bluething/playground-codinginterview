package io.github.bluething.playground.codinginterview.loop;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class virtualfriends {
    virtualfriends parent;
    int size;

    public virtualfriends() {
        this.parent = this;
        this.size = 1;
    }

    public virtualfriends find() {
        if (this.parent == this) {
            return this;
        } else {
            // path compression
            this.parent = this.parent.find();
            return this.parent;
        }
    }

    public int union(virtualfriends newFriend) {
        virtualfriends firstRoot = this.find();
        virtualfriends secondRoot = newFriend.find();

        // keep the tree small
        if (firstRoot == secondRoot) {
            return firstRoot.size;
        } else if (firstRoot.size > secondRoot.size) {
            secondRoot.parent = firstRoot;
            firstRoot.size += secondRoot.size;
            return firstRoot.size;
        } else {
            firstRoot.parent = secondRoot;
            secondRoot.size += firstRoot.size;
            return secondRoot.size;
        }
    }

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int numOfCase = io.getInt();
        Map<String, virtualfriends> friendsOf = new HashMap<>();
        for (int i = 0; i < numOfCase; i++) {
            int numOfFriendShip = io.getInt();
            for (int j = 0; j < numOfFriendShip; j++) {
                String friend1 = io.getWord();
                String friend2 = io.getWord();

                friendsOf.putIfAbsent(friend1, new virtualfriends());
                friendsOf.putIfAbsent(friend2, new virtualfriends());

                int numOfFriend = friendsOf.get(friend1).union(friendsOf.get(friend2));
                io.println(numOfFriend);
            }

            friendsOf.clear();
        }

        io.close();
    }
}
