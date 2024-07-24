package exceptionHandling.chaining;

public class WithChaining {
    public static void main(String[] args) {
        getLeave();
    }

    private static void getLeave() {
        try {
            howIsTeamLead();
        } catch (TeamLeadUpsetException e) {
            throw new NoLeaveGrantedException("Leave not sanctioned", e);
        }
    }

    private static void howIsTeamLead() {
        try {
            howIsManager();
        } catch (ManagerUpsetException e) {
            throw new TeamLeadUpsetException("Team lead is not in good mood", e);
        }
    }

    private static void howIsManager() {
        try {
            howIsManagerWife();
        } catch (ManagerWifeUpsetException e) {
            throw new ManagerUpsetException("Manager is upset", e);
        }
    }

    private static void howIsManagerWife() {
        throw new ManagerWifeUpsetException("Manager Wife is in bad mood.");
    }
}
