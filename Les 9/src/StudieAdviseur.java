public class StudieAdviseur {

    public static boolean krijgtPositiefStudieadvies(Student s) {
        int count = 0;

        for (int cijfer : s.getCijfers()) {
            if (cijfer >= 6) {
                count++;
            }
        }
        return count >= 4;
    }
}
