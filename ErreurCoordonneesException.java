class ErreurCoordonneesException extends RuntimeException {
   
    private int x;
    private int y;


    ErreurCoordonneesException(int a , int b ){
        this.x = a;
        this.y = b;

    }

    @Override
    public String getMessage(){
        String Message = "";
        if (x < 0 || (x > 7 && y < 0) || y > 7){
            
           Message =  "Erreur dans la position X : 8 - Les indices doivent être compris entre 0 et 7.\n";
           Message += "Erreur dans la position Y : 9 - Les indices soivent être compris entre 0 et 7.";
           return  Message;

        }
        if ( x < 0 || x > 7){
            Message = "Erreur dans la position X : 8 - Les indices doivent être compris entre 0 et 7.\n";
            return Message;
        }
        if ( y < 0 || y > 7){
            Message = "Erreur dans la position Y : 9 - Les indices soivent être compris entre 0 et 7.";
            return Message;
        }
        return Message;
    }
}