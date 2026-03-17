public class GameCharacter {
    public int health;
    public int power;
    public int position;
    public String name;

    public GameCharacter(){
        this.health = 100;
        this.power = 10;
        this.position = 0;
    }

    public GameCharacter(int h, int p, int pos, String n){
        this.health = h;
        this.power = p;
        position = pos;
        name = n;
    }

    public void moveForward(int steps){
        position += steps;
    }

    public void moveBackward(int steps){
        position -= steps;

        //also works
        //
        moveForward(steps * -1);
    }

    public void attack(GameCharacter target){
        target.health -= this.power;
    }

    public boolean isDefeated(){
        if(health <= 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
