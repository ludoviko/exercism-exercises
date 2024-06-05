public class SpaceAge {
    private static final double EARTH_ORBITAL_PERIOD_SECONDS = 31557600.0;

    // Age in seconds.
    private long seconds;

    public SpaceAge(long age) {
        this.seconds = age;
    }

    /**
     *
     * @param anyOrbitalPeriodYears of any planet in earth's years.
     *
     * @return given an age in seconds, calculates the age in terms of a given planet's solar years.
     *
     */
    private double getOrbitalPeriodYears(double anyOrbitalPeriodYears) {
        return getSeconds() / (EARTH_ORBITAL_PERIOD_SECONDS * anyOrbitalPeriodYears);
    }

    public long getSeconds() {
        return this.seconds;
    }

    public double onEarth() {
        return this.getOrbitalPeriodYears(Planet.EARTH.orbitalPeriodYears());
    }

    public double onMercury() {
        return this.getOrbitalPeriodYears(Planet.MERCURY.orbitalPeriodYears());
    }

    public double onVenus() {
        return this.getOrbitalPeriodYears(Planet.VENUS.orbitalPeriodYears());
    }

    public double onMars() {
        return this.getOrbitalPeriodYears(Planet.MARS.orbitalPeriodYears());
    }

    public double onJupiter() {
        return this.getOrbitalPeriodYears(Planet.JUPITER.orbitalPeriodYears());
    }

    public double onSaturn() {
        return this.getOrbitalPeriodYears(Planet.SATURN.orbitalPeriodYears());
    }

    public double onUranus() {
        return this.getOrbitalPeriodYears(Planet.URANUS.orbitalPeriodYears());
    }

    public double onNeptune() {
        return this.getOrbitalPeriodYears(Planet.NEPTUNE.orbitalPeriodYears());
    }

    // Enumeration of planets.
    public enum Planet {
        EARTH (1),
        MERCURY (0.2408467),
        VENUS   (0.61519726),
        MARS    (1.8808158),
        JUPITER (11.862615),
        SATURN  (29.447498),
        URANUS  (84.016846),
        NEPTUNE (164.79132);

        // Planet's orbital periond expressed in earth's years as unit.
        private final double orbitalPeriodYears;

        Planet(double orbitalPeriodYears) {
            this.orbitalPeriodYears = orbitalPeriodYears;
        }

        private double orbitalPeriodYears() {
            return this.orbitalPeriodYears;
        }
    }
}