
import java.util.LinkedList;
import java.util.ListIterator;

class SortedIntList {
    LinkedList<Integer> list;
    boolean isRepetitive;

    public SortedIntList(boolean repeatition) {
        isRepetitive = repeatition;
        list = new LinkedList<Integer>();
    }

    public void add(int a) {
        ListIterator<Integer> it = list.listIterator();
        if(list.size() == 0) {
            it.add(a); 
            return;
        }
        while(it.hasNext() && a > it.next()) {};
        it.previous();
        if(!isRepetitive) {
            if(a == it.next())
                return;
            else
                it.previous();    
        }
        if(a > it.next())
            it.add(a);
        else {
            it.previous();
            it.add(a);
        }
    }

    public boolean equals(SortedIntList b) {
        if(this.list.size() != b.list.size())
            return false;
        ListIterator<Integer> it1 = list.listIterator();
        ListIterator<Integer> it2 = b.list.listIterator();
        while(it1.hasNext() && it2.hasNext()) {
            if(it1.next() != it2.next())
                return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        ListIterator<Integer> it = list.listIterator();
        while(it.hasNext()) {
                str.append(it.next());
                str.append(" ");
        }
        return str.toString();
    }
}