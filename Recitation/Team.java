/**
 * Recitation 1 code: Team class
 *
 * @author: Jivan Achar
 *
 * CS10, Jan 13, 2022
 */
public class Team {

    private String name;
    private Integer score;

    /**
     *
     * @param name is a string inputted to be the mascot name
     */
    public Team (String name) {
        this.name = name;
        this.score = 0;
    }

    /**
     *
     * @return string var -- mascot name
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @return int for score
     */
    public Integer getScore() {
        return this.score;
    }

    public void score() {
        this.score += 2;
    }

    public static void main(String[] args) {
        Team Liverpool = new Team("Liverpool");
        Team ManUnited = new Team("Manchester United");

        Liverpool.score();
        ManUnited.score();
        ManUnited.score();

        if (Liverpool.getScore() > ManUnited.getScore()) {
            System.out.println(Liverpool.name);
        }
        else if (ManUnited.getScore() > Liverpool.getScore()) {
            System.out.println(ManUnited.name);
        }
    }
}
