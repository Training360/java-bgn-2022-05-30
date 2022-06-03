package inheritance;

import java.util.ArrayList;
import java.util.List;

public class ContractMain {


    public static void main(String[] args) {
        Contract contract = new Contract("Szerződés 1.");
        System.out.println(contract.getTitle());

        ContractWithAttachment another
                = new ContractWithAttachment("Szerződés 2.", "Attach");
        System.out.println(another.getTitle());
        System.out.println(another.getAttachment());

        Contract sup = another;

        ((ContractWithAttachment) sup).getAttachment();

        ContractWithAttachment sup2 = (ContractWithAttachment) contract;

        List<String> l = new ArrayList<>();

        l.add((String) "Alma");

        String s = (String) l.get(0);



    }
}
