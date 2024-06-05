public class FootballMatchReports {    
    public static String onField(int shirtNum) {
        String data = null;
        switch (shirtNum) {
            case 1:
                data = "goalie";
                break;
            case 2:
                data = "left back";
                break;
            case 3, 4:
                data = "center back";
                break;
            case 5:
                data = "right back";
                break;
            case 6, 7, 8:
                data = "midfielder";
                break;
            case 9:
                data = "left wing";
                break;
            case 10:
                data = "striker";
                break;
            case 11:
                data = "right wing";
                break;
            default:
                throw new IllegalArgumentException();
        }

        return data;
    }
}

