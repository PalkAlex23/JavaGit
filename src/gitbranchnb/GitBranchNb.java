package gitbranchnb;
public class GitBranchNb {

    public static void main(String[] args) {
        GitBranchNb obj = new GitBranchNb();
        int i = obj.fv();
    }

    private int fv() {
        System.out.println("Nem static fv");
        return 0;
    }
}
