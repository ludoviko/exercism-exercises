import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class DnDCharacter {
    private final int strength;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;

    DnDCharacter() {
        strength = ability(rollDice());
        dexterity = ability(rollDice());
        constitution = ability(rollDice());
        intelligence = ability(rollDice());
        wisdom = ability(rollDice());
        charisma = ability(rollDice());
    }

    int ability(List<Integer> scores) {
        Integer min = scores.stream().min(Integer::compare).get();

        int sum = scores.stream().reduce(0, Integer::sum);

        return sum - min;
    }

    List<Integer> rollDice() {
        List<Integer> data = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            data.add(random.nextInt(1,7));
        }

        return data;
    }

    int modifier(int input) {
        return (int) Math.floor((input - 10) / 2.0);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return 10 + this.modifier(constitution);
    }
}
