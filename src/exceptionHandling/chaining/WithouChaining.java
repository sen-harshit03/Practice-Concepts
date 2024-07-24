package exceptionHandling.chaining;

public class WithouChaining {
    public static void main(String[] args) {
        getLeave();
    }

    private static void getLeave() {
        try {
            howIsTeamLead();
        } catch (TeamLeadUpsetException e) {
            e.printStackTrace();
            throw new NoLeaveGrantedException("Leave not sanctioned");
        }
    }

    private static void howIsTeamLead() {
        try {
            howIsManager();
        } catch (ManagerUpsetException e) {
            e.printStackTrace();
            throw new TeamLeadUpsetException("Team lead is not in good mood");
        }
    }

    private static void howIsManager() {
        try {
            howIsManagerWife();
        } catch (ManagerWifeUpsetException e) {
            e.printStackTrace();
            throw new ManagerUpsetException("Manger is upset");
        }
    }

    private static void howIsManagerWife() {
        throw new ManagerWifeUpsetException("Manager Wife is in bad mood.");
    }
}
