package banch.task.leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class KeysAndRooms {

    public static void main(String[] args) {
        KeysAndRooms cla = new KeysAndRooms();
        List<Integer> inRoom1 = List.of(1,3);
        List<Integer> inRoom2 = List.of(3, 0, 1);
        List<Integer> inRoom3 = List.of(2);
        List<Integer> inRoom4 = List.of(0);
        List<List<Integer>> listList1 = List.of(inRoom1, inRoom2, inRoom3, inRoom4);
        List<List<Integer>> list2 = List.of(List.of(1), List.of(2), List.of(3), List.of(0));
        List<List<Integer>> list3 = List.of(List.of(2), List.of(), List.of(1));

        System.out.println(cla.canVisitAllRooms(listList1));
        System.out.println(cla.canVisitAllRooms(list2));
        System.out.println(cla.canVisitAllRooms(list3));
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> roomVisited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(0);

        while (!q.isEmpty()) {
            int currentR = q.poll();
            roomVisited.add(currentR);
            List<Integer> sets = rooms.get(currentR);
            for (int i: sets) {
                if (!roomVisited.contains(i)) {
                    q.add(i);
                }
            }
        }

        return roomVisited.size() == rooms.size();
    }
}
