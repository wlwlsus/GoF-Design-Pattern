package ch4_factory.concreate;

import ch4_factory.framework.Item;

public class MpPotion implements Item {
    @Override
    public void use() {
        System.out.println("마나 회복!!");
    }
}
