import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {

        Set<String> mySet = new HashSet<>(myCollection);
        Set<String> theirSet = new HashSet<>(theirCollection);

        mySet.removeAll(theirCollection);
        theirSet.removeAll(myCollection);

        return !mySet.isEmpty() && !theirSet.isEmpty();
    }

    static Set<String> commonCards(List<Set<String>> collections) {

        Set<String> setInitial = new HashSet<>(collections.getFirst());

        for (Set<String> set : collections) {
            setInitial.retainAll(set);
        }

        return setInitial;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> setInitial = new HashSet<>();

        for (Set<String> set : collections) {
            setInitial.addAll(set);
        }

        return setInitial;
    }
}
