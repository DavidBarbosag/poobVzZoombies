package com.PlantsvsZombiesDomain;

/**
 * Class Plant that extends Something class, this class is for the plants
 */
public abstract class Plant extends Something{

    private int health;
    private int price;
    protected Player owner;

    /**
     * Constructor of the Plant
     *
     * @param position position of the plant
     * @param health   health of the plant
     * @param price    price of the plant
     * @param owner    owner of the plant
     * @param board
     */
    public Plant(int[] position, int health, int price, Player owner, Board board)  throws PlantsVsZombiesException {
        super(position, board);
        this.health = health;
        this.price = price;
        this.owner = owner;
    }

    /**
     * get the health
     * @return health
     */
    public int getHealth() {
        return health;
    }

    /**
     * set the health
     * @param health health
     */
    public void setHealth(int health) {
        this.health = health;
    }


    public void reduceHealth(int amount) {
        health -= amount;
        if (health < 0) {
            health = 0; // Asegurarse de que la salud no sea negativa
        }
    }

    /**
     * get the price
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * set the owner
     * @param owner
     */
    public void setOwner(Player owner) {
        this.owner = owner;
    }

    /**
     * get the owner
     * @return owner
     */
    public Player getOwner() {
        return owner;
    }

}
