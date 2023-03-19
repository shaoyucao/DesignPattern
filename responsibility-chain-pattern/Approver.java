public abstract class Approver {
    protected Approver approver;

    public Approver() {
    }

    public Approver(Approver approver) {
        this.approver = approver;
    }

    public Approver getApprover() {
        return approver;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    protected abstract void approve(Course course);
}
