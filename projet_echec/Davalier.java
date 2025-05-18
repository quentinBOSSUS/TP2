import java.util.ArrayList;

public class Davalier extends Piece{
    
    public Davalier() {
        super('B', new Position());
    }

    public Davalier(char couleur, Position position) {
        super(couleur, position);
    }

    public String getType() {
        return new String("davalier");
    }

    public ArrayList<Position> getDeplacementPossible(Plateau pl) {
        ArrayList<Position> retour = new ArrayList<Position>();

        Dame d = new Dame(this.getCouleur(), this.getPosition());
        Cavalier c = new Cavalier(this.getCouleur(), this.getPosition());


        ArrayList<Position> deplacementPossible = d.getDeplacementPossible(pl);
        for(Position p : deplacementPossible)
            retour.add(p);
        
        deplacementPossible = c.getDeplacementPossible(pl);
        for(Position p : deplacementPossible)
            retour.add(p);

        return retour;
    }
}
