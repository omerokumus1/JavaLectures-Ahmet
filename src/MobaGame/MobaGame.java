package MobaGame;

import MobaGame.Equipments.Equipment;
import MobaGame.Equipments.MagicalAttackEquipment;
import MobaGame.Equipments.PhysicalAttackEquipment;
import MobaGame.Heros.Assassin;
import MobaGame.Heros.Hero;
import MobaGame.Heros.Mage;
import MobaGame.Skills.MagicalDamageSkill;
import MobaGame.Skills.PhysicalDamageSkill;
import MobaGame.Skills.Skill;

public class MobaGame {
    public static void main(String[] args) {
        /* TODO:
         *   1. Oyunu bitime şartını ekle: kahramanın sağlığı sıfır veya altına düşerse
         *   2. Arcanaları oluştur
         *   3. Becerileri oluştur
         *   4. Ekipmanları oluştur
         *   5. Saldırı yaparken becerilerin etkini hesaba kat (attack methoduna yaz)
         *   6. Saldırı yaparken sp kontrolü yap, becerileri ona göre kullan
         *   7. main içinde skills[], equipments[] arcanas[] ve heros[] oluştur
         *   8. play methodunda: 2 tane User oluştur, 2 tane kullanıcı toplam 10 kere maç yapcak her maçın sonunda
         *       alışveriş yapacaklar veya arcana yükseltecekler.
         *   +9. Silinecekler: Arcana+, arcana fragment+, attackSpeed+, speed+, skillAttack+, range+,
         *  10. Magical ve Physical Attack Equipment için attack property'lerini Attack Equipment'a geçir
         *  +11. SupportingSkill sil
         *  12. Magical ve Physical Damage Skill için attackPercent property'sini Skill classına al.
         * */

    }

    public static void play() {

    }

    public static void initializeHeros(Skill[] skills) {
        Hero[] heroes = {
//                new Assassin("Murad", 4000, 500, 200, 50,
//                        150, 150, 100, 30,
//                        new Skill[]{skills[0], skills[1], skills[2]}, 250),
//                new Mage("Tulen", 4200, 700, 150, 100, 100,
//                        20, 10, new Skill[]{skills[3], skills[4], skills[5]}, 200),
//                new Marksman("Yorn", )
        };
    }

    public static Skill[] initializeSkills() {
        Skill[] skills = {
                // Murad
                new PhysicalDamageSkill("Zaman Dikeni", 6, 100),
                new PhysicalDamageSkill("Başka Boyut", 6, 90),
                new PhysicalDamageSkill("Zaman Türbülansı", 12, 60),
                // Tulen
                new MagicalDamageSkill("İyon Prizması", 6, 75),
                new MagicalDamageSkill("Yıldırım Vuruşu", 4, 50),
                new MagicalDamageSkill("Şimşek Kuşu", 12, 80),
                // Yorn
                new PhysicalDamageSkill("Patlayan Ok", 7, 80),
                new PhysicalDamageSkill("Yürekten Vuran", 7, 50),
                new PhysicalDamageSkill("Cennet Yaylım Ateşi", 12, 120)

        };

        return skills;
    }

    public static Equipment[] initializeEquipments() {
        Equipment[] equipments = {
//                new PhysicalAttackEquipment(2030, 10, 80),
//                new PhysicalAttackEquipment(2040, 30, 60),
//                new PhysicalAttackEquipment(2120, 0, 100),
//                new PhysicalAttackEquipment(2020, 0, 75),
//                new PhysicalAttackEquipment(1740, 0, 60),
//                new PhysicalAttackEquipment(2950, 0, 200),
//                new PhysicalAttackEquipment(2020, 0, 110),
//                new PhysicalAttackEquipment(2000, 0, 60),
//                new MagicalAttackEquipment(3000, 20, 210),
//                new MagicalAttackEquipment(1800, 20, 140),
//                new MagicalAttackEquipment(1970, 20, 180),
//                new MagicalAttackEquipment(1800, 20, 120),

        };
        return equipments;
    }

}

