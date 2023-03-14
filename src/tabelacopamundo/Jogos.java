package tabelacopamundo;
public class Jogos {
    private Selecoes time1;
    private Selecoes time2;
    public void Jogo1(Selecoes timec, Selecoes timev){
        int resultado = timec.getGolsjogo1()-timev.getGolsjogo1();
        if(resultado>0){
            timec.ganhar();
            timev.perder();
        }else if(resultado==0){
            timec.empatar();
            timev.empatar();
        }else if(resultado<0){
            timec.perder();
            timev.ganhar();
        }
    }
    public void Jogo2(Selecoes timec, Selecoes timev){
        int resultado = timec.getGolsjogo2()-timev.getGolsjogo2();
            if(resultado>0){
                timec.ganhar();
                timev.perder();
            }else if(resultado==0){
                timec.empatar();
                timev.empatar();
            }else if(resultado<0){
                timec.perder();
                timev.ganhar();
            }
    }
    public void Jogo3(Selecoes timec, Selecoes timev){
        int resultado = timec.getGolsjogo3()-timev.getGolsjogo3();
            if(resultado>0){
                timec.ganhar();
                timev.perder();
            }else if(resultado==0){
                timec.empatar();
                timev.empatar();
            }else if(resultado<0){
                timec.perder();
                timev.ganhar();
            }
    }
}
