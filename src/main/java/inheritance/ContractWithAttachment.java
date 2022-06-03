package inheritance;

public class ContractWithAttachment extends Contract {

    private String attachment;

    public String getAttachment() {
        return attachment;
    }

    public ContractWithAttachment(String title, String attachment) {
        super(title);
        this.attachment = attachment;
    }

    @Override
    public String getInfo() {
        return getTitle() + " " + attachment;
    }

    @Override
    public ContractWithAttachment copy() {
        return new ContractWithAttachment(getTitle(), attachment);
    }
}
