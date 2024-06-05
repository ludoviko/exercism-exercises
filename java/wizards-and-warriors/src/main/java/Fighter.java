class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    boolean isVulnerable() {
        return false;
    }

    int getDamagePoints(Fighter fighter) {
        if (fighter.isVulnerable()) {
            return 10;
        } else {
            return 6;
        }
    }
}

class Wizard extends Fighter {
    private boolean vulnerable = true;
    void prepareSpell() {
        vulnerable = false;
    }

  boolean isVulnerable() {
        return vulnerable;
  }
  int getDamagePoints(Fighter fighter) {
        if (this.isVulnerable()) {
            return 3;
        } else {
            return 12;
        }
  }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}
