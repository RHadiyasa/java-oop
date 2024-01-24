package com.enigma.oop_java.object_interaction;

public class Hero implements HitAble{
    private String name;
    private Integer hp;
    private Integer damage;

    public Hero(String name, Integer hp, Integer damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
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

    public Integer getDamage() {
        return damage;
    }

//    public void attack(Monster monster) {
//        monster.receiveDamage(this.damage);
//        System.out.println(this.name + " Attacking");
//        System.out.println(monster.getHp());
//    }
    public void attack(HitAble character){
        System.out.println(this.name + " Attack " + character.getName() + " | Health : ("  + character.getHp() + ")");
        character.receiveDamage(this.damage);
        System.out.println(character.getName() + " Health : " + character.getHp());
    }

    @Override
    public void receiveDamage(Integer damage) {
        if (this.hp - damage <= 0) {
            System.out.println(this.name + " mati");
        } else {
            this.hp -= damage;
        }
    }
}
