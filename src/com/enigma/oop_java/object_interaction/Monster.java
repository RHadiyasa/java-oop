package com.enigma.oop_java.object_interaction;

public class Monster implements HitAble{
    private String name;
    private Integer hp;
    private Integer damage;

    public Monster(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

//    public void attack(Monster monster) {
//        if (this.equals(monster)) {
//            System.out.println("Illegal Action");
//        } else {
//            System.out.println(monster.getName() + " Initial health : " + monster.getHp());
//            monster.hp -= this.damage;
//            System.out.println(this.name + " Attacking " + monster.getName() + " -> Damage : " + this.damage);
//            System.out.println(monster.getName() + " Health : " + monster.getHp() + "\n--------");
//        }
//    }
//
//    public void attack(Hero hero) {
//        System.out.println(hero.getName() + " Initial health : " + hero.getHp());
//        System.out.println(this.name + " Attacking " + hero.getName() + " -> Damage : " + this.damage);
//        hero.receiveDamage(this.damage);
//        if (!(hero.getHp() - this.damage <= 0)) {
//            System.out.println(hero.getName() + " Health : " + hero.getHp() + "\n--------");
//        }
//    }

    public void attack(HitAble character){
        System.out.println(this.name +  " Attack " + character.getName());
        character.receiveDamage(this.damage);
        System.out.println(character.getName() + " health : " + character.getHp());
    }

    @Override
    public void receiveDamage(Integer damage){
        this.hp -= damage;
    }
}
