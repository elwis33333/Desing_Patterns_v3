package main.java.strategy.option;

import main.java.strategy.domain.Knight;
import main.java.strategy.domain.Weapons;

import java.util.LinkedList;
import java.util.List;

public class ArchValidator implements KnightValidator {
    private List<Weapons> weaponsDistanceAttack;

    public boolean validate(Knight knight) {
        initDistanceWeapons();
        for (Weapons w : weaponsDistanceAttack) {
            if (isAvailableInEquipment(w, knight))
                return true;
        }
        return false;
    }

    private boolean isAvailableInEquipment(Weapons w, Knight knight) {
        return knight.getEquipment().contains(w);
    }

    private void initDistanceWeapons() {
        weaponsDistanceAttack = new LinkedList<Weapons>();
        weaponsDistanceAttack.add(Weapons.BOW);
        weaponsDistanceAttack.add(Weapons.CROSSBOW);
    }
}
