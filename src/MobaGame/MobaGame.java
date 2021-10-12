package MobaGame;

import MobaGame.Arcanas.Arcana;
import MobaGame.Arcanas.MagicalAttackArcana;
import MobaGame.Arcanas.PhysicalAttackArcana;
import MobaGame.Equipments.Equipment;
import MobaGame.Equipments.MagicalAttackEquipment;
import MobaGame.Equipments.PhysicalAttackEquipment;
import MobaGame.Heros.Mage;
import MobaGame.Skills.MagicalDamageSkill;
import MobaGame.Skills.PhysicalDamageSkill;
import MobaGame.Skills.Skill;

public class MobaGame {
    public static void main(String[] args) {
        Arcana[] arcanas1 = {
                new MagicalAttackArcana(10),
                new MagicalAttackArcana(15),
        };

        Arcana[] arcanas2 = {
                new PhysicalAttackArcana(20),
                new PhysicalAttackArcana(15),
        };
        Skill[] skills1 = {
                new MagicalDamageSkill("Presentation", 20, 20),
                new MagicalDamageSkill("Deep Dive", 40, 25),
                };

        Skill[] skills2 = {
                new PhysicalDamageSkill("Arrow Rain", 50, 10),
                new PhysicalDamageSkill("Air Strike", 70, 30),
        };

        Equipment[] equipments1 = {
                new MagicalAttackEquipment(1000, 20, 500),
                new MagicalAttackEquipment(1500, 10, 750),

        };
        Equipment[] equipments2 = {
                new PhysicalAttackEquipment(1000, 25, 550),
                new PhysicalAttackEquipment(1200, 20, 700)
        };

        Equipment eq = equipments1[0];
        System.out.println(eq.getClass());
//
//        Mage mage = new Mage("Paine", 2000, 400, 200,
//                10, 500, 500, 50, 20, arcanas1,
//);
    }
}
