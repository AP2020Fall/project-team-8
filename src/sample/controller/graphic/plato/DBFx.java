package sample.controller.graphic.plato;


import javafx.scene.Parent;

public class DBFx {
    private static Parent pre;

    public static void setPre(Parent pre) {
        DBFx.pre = pre;
    }
    /* private  ArrayList<Line> ra11=new ArrayList<>();

    private ArrayList<Line> ra77=new ArrayList<>();
    public Line vl77;
    public Line vl72;
    public Line vl82;
    public Line vl83;
    public Line vl81;
    public Line vl71;
    public Line vl73;
    public Line hl81;
    public Line hl82;
    public Line hl83;
    public Line hl84;
    public Line hl85;
    public Line hl86;
    public Line hl87;
    public Line vl84;
    public Line vl74;
    public Line vl75;
    public Line vl85;
    public Line vl87;
    public Line vl18;
    public Line vl76;
    public Line vl86;
    public Line vl28;
    public Line vl38;
    public Line vl48;
    public Line vl58;
    public Line vl78;
    public Line vl88;
    public Rectangle r21;
    public Rectangle r22;
    public Rectangle r23;
    public Rectangle r24;
    public Rectangle r25;
    public Rectangle r26;
    public Rectangle r27;
    public Rectangle r12;
    public Rectangle r13;
    public Rectangle r14;
    public Rectangle r15;
    public Rectangle r16;
    public Rectangle r17;
    public Rectangle r31;
    public Rectangle r32;
    public Rectangle r33;
    public Rectangle r34;
    public Rectangle r35;
    public Rectangle r36;
    public Rectangle r37;
    public Rectangle r41;
    public Rectangle r42;
    public Rectangle r43;
    public Rectangle r44;
    public Rectangle r45;
    public Rectangle r46;
    public Rectangle r47;
    public Rectangle r51;
    public Rectangle r52;
    public Rectangle r53;
    public Rectangle r54;
    public Rectangle r55;
    public Rectangle r56;
    public Rectangle r57;
    public Rectangle r61;
    public Rectangle r62;
    public Rectangle r63;
    public Rectangle r64;
    public Rectangle r65;
    public Rectangle r66;
    public Rectangle r67;
    public Rectangle r71;
    public Rectangle r72;
    public Rectangle r73;
    public Rectangle r74;
    public Rectangle r75;
    public Rectangle r76;
    public Circle sc11;
    public Circle sc12;
    public Circle sc13;
    public Circle sc14;
    public Circle sc15;
    public Circle sc16;
    public Circle sc17;
    public Circle sc18;
    public Circle sc21;
    public Circle sc22;
    public Circle sc23;
    public Circle sc24;
    public Circle sc25;
    public Circle sc26;
    public Circle sc27;
    public Circle sc28;
    public Circle sc31;
    public Circle sc32;
    public Circle sc33;
    public Circle sc34;
    public Circle sc35;
    public Circle sc36;
    public Circle sc37;
    public Circle sc38;
    public Circle sc41;
    public Circle sc42;
    public Circle sc43;
    public Circle sc44;
    public Circle sc45;
    public Circle sc46;
    public Circle sc47;
    public Circle sc48;
    public Circle sc51;
    public Circle sc52;
    public Circle sc53;
    public Circle sc54;
    public Circle sc55;
    public Circle sc56;
    public Circle sc57;
    public Circle sc58;
    public Circle sc61;
    public Circle sc62;
    public Circle sc63;
    public Circle sc64;
    public Circle sc65;
    public Circle sc66;
    public Circle sc67;
    public Circle sc68;
    public Circle sc71;
    public Circle sc72;
    public Circle sc73;
    public Circle sc74;
    public Circle sc75;
    public Circle sc76;
    public Circle sc77;
    public Circle sc78;
    public Circle sc81;
    public Circle sc82;
    public Circle sc83;
    public Circle sc84;
    public Circle sc85;
    public Circle sc86;
    public Circle sc87;
    public Circle sc88;
    private boolean hasCountDown;
    public ImageView dbBackground;
    public ImageView p1Img;
    public ImageView p2Img;
    public Text p1Score;
    public Text p2Score;
    public Label alertMessage;
    public Line hl11;
    public Line hl12;
    public Line hl13;
    public Line hl14;
    public Line hl15;
    public Line hl16;
    public Line hl17;
    public Line hl21;
    public Line hl22;
    public Line hl23;
    public Line hl24;
    public Line hl25;
    public Line hl26;
    public Line hl27;
    public Line hl31;
    public Line hl32;
    public Line hl33;
    public Line hl34;
    public Line hl35;
    public Line hl36;
    public Line hl37;
    public Line hl41;
    public Line hl42;
    public Line hl43;
    public Line hl44;
    public Line hl45;
    public Line hl46;
    public Line hl47;
    public Line hl51;
    public Line hl52;
    public Line hl53;
    public Line hl54;
    public Line hl55;
    public Line hl56;
    public Line hl57;
    public Line hl61;
    public Line hl62;
    public Line hl63;
    public Line hl64;
    public Line hl65;
    public Line hl66;
    public Line hl67;
    public Line hl71;
    public Line hl72;
    public Line hl73;
    public Line hl74;
    public Line hl75;
    public Line hl76;
    public Line hl77;
    public Line vl11;
    public Line vl12;
    public Line vl13;
    public Line vl14;
    public Line vl15;
    public Line vl16;
    public Line vl17;
    public Line vl21;
    public Line vl22;
    public Line vl23;
    public Line vl24;
    public Line vl25;
    public Line vl26;
    public Line vl27;
    public Line vl31;
    public Line vl32;
    public Line vl33;
    public Line vl34;
    public Line vl35;
    public Line vl36;
    public Line vl37;
    public Line vl41;
    public Line vl42;
    public Line vl43;
    public Line vl44;
    public Line vl45;
    public Line vl46;
    public Line vl47;
    public Line vl51;
    public Line vl52;
    public Line vl53;
    public Line vl54;
    public Line vl55;
    public Line vl56;
    public Line vl57;
    //moraba haye tamame khuneha
    public Rectangle r11;
    public Rectangle r77;
    private ArrayList<Circle> selectedC=new ArrayList<>();
    private boolean isSecondCircle=false;
    private DBPlayer firstPlayer;
    private model.DbGameMenu secondPlayer;
    private int firstPlayerScore;
    private int secondPlayerScore;
    private boolean isFirstPlayerTurn;
    private boolean isRectangleDone;
    private ArrayList<Line> selectedL;
    //   private boolean isFirst;
    private Stage stage;

    public void setHasCountDown(boolean hasCountDown) {
        this.hasCountDown = hasCountDown;
    }
   /* public void initialize(){
        dbBackground.setOnMouseClicked(e->{
            double x=e.getX();
            double y=e.getY();
            Circle circle=new Circle(x,y,10);
            Group root = new Group(circle);
         //   primaryStage.setTitle("Hello World");
            stage.setScene(new Scene(root, 300, 275));
            stage.show();
        });
    }*/

   /* public void drawCircle(int centerX,int centerY){
//Drawing a Circle
        Circle circle = new Circle(centerX, centerY, 10);

        //Creating a Group object
        Group root = new Group(circle);
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
    public void setTimer(){
        // Timer timer=new Timer(120000,this);
    }

    public void drawCircle(MouseEvent mouseEvent) {
        double x=  mouseEvent.getX();
        double y=mouseEvent.getY();
        Circle circle=new Circle(x,y,10);
        circle.setVisible(true);
    }

    public void showC(MouseEvent mouseEvent) {
        double x= MouseInfo.getPointerInfo().getLocation().getX();
        double y=MouseInfo.getPointerInfo().getLocation().getY();
        //command for first player
        if (isFirstPlayerTurn) {

            if (!isSecondCircle) {
                //dayere avali
                if (x >11 || x<47 && y>4 ||y<40) {
                    sc11.setVisible(true);
                    selectedC.add(sc11);
                } else if () {
                }


                isSecondCircle = true;

            } else {
                //dayere dovomi va badesh khat keshidan
                if (x >11 || x<47 && y>4 ||y<40) {
                    Circle firstCircle =selectedC.get(0);
                    if (firstCircle.getCenterX()==80 && firstCircle.getCenterY()==22){
                        sc11.setVisible(true);
                        hl11.setVisible(true);
                        //baraye rang
                     //   hl11;
                        //in mishe voice jadide ke ezafe kardam
                        ra11.add(hl11);
                        if (isSecondCircle) {
                            if (x <) {
                                sc11.setVisible(true);
                                isSecondCircle = true;
                                hl11.setVisible(true);
                            } else if () {
                            }

                    else if (firstCircle.getCenterX()==29&&firstCircle.getCenterY()==73){
                        sc21.setVisible(true);
                        vl21.setVisible(true);
                        //in mishe voice jadide ke ezafe kardam
                        ra11.add(vl21);
                    }
                    else{
                        alertMessage.setText("invalid move");
                    }
                    //baraye khali kardane arraylist bara hamash lazeme
                    selectedC.clear();


                }

                isSecondCircle = true;
            }
            isFirstPlayerTurn=false;
        }
        //commands for second player
        else {


            isFirstPlayerTurn=true;
        }}
    }


    /*public void showL(MouseEvent mouseEvent) {
        double x= MouseInfo.getPointerInfo().getLocation().getX();
        double y=MouseInfo.getPointerInfo().getLocation().getY();
        Circle circle1= selectedC.get(0);
        Circle circle2=selectedC.get(1);
        if (circle1.getCenterX()==29&& circle2.getCenterY()==22){

        }


    }*/

  /*  public void drawLine(MouseEvent mouseEvent){
        if (isFirstPoint){
            drawCircle();
        }
        else{
            drawCircle();

        }
    }

}
    public void showC(MouseEvent mouseEvent) {
        double x= MouseInfo.getPointerInfo().getLocation().getX();
        double y=MouseInfo.getPointerInfo().getLocation().getY();
        //command for first player
        //player1 color: #bac267 and player2 color: #c17f68
        if (isFirstPlayerTurn) {
            if (!isSecondCircle) {
                if (x > 11 && x < 47 && y > 4 && y < 40) {
                    sc11.setVisible(true);
                    sc11.setFill(Color.web("#bac267"));
                    //jadid
                    selectedC.add(sc11);
                } else if (x > 62 && x < 98 && y > 4 && y < 40) {
                    sc12.setVisible(true);
                    sc12.setFill(Color.web("#bac267"));
                    //jadid
                    selectedC.add(sc12);
                }
                //ela akhar...
                else if (x > 112 && x < 148 && y > 5 && y < 41) {
                    sc13.setVisible(true);
                    sc13.setFill(Color.web("#bac267"));
                }
                else if (x > 161 && x < 197 && y > 5 && y < 41) {
                    sc14.setVisible(true);
                    sc14.setFill(Color.web("#bac267"));
                }

                else if (x > 212 && x < 248 && y > 5 && y < 41) {
                    sc15.setVisible(true);
                    sc15.setFill(Color.web("#bac267"));
                }

                else if (x > 262 && x < 298 && y > 5 && y < 41) {
                    sc16.setVisible(true);
                    sc16.setFill(Color.web("#bac267"));
                }
                else if (x > 312 && x < 348 && y > 5 && y < 41) {
                    sc17.setVisible(true);
                    sc17.setFill(Color.web("#bac267"));
                }
                else if (x > 360 && x < 396 && y > 5 && y < 41) {
                    sc18.setVisible(true);
                    sc18.setFill(Color.web("#bac267"));
                }
                else if (x > 11 && x < 47 && y > 55 && y < 91) {
                    sc21.setVisible(true);
                    sc21.setFill(Color.web("#bac267"));
                }
                else if (x > 98 && x < 62 && y > 55 && y < 91) {
                    sc22.setVisible(true);
                    sc22.setFill(Color.web("#bac267"));
                }
                else if (x > 148 && x < 112 && y > 55 && y < 91) {
                    sc23.setVisible(true);
                    sc23.setFill(Color.web("#bac267"));
                }
                else if (x > 197 && x < 161 && y > 55 && y < 91) {
                    sc24.setVisible(true);
                    sc24.setFill(Color.web("#bac267"));
                }
                else if (x > 248 && x < 212 && y > 55 && y < 91) {
                    sc25.setVisible(true);
                    sc25.setFill(Color.web("#bac267"));
                }
                else if (x > 298 && x < 262 && y > 55 && y < 91) {
                    sc26.setVisible(true);
                    sc26.setFill(Color.web("#bac267"));
                }
                else if (x > 348 && x < 312 && y > 55 && y < 91) {
                    sc27.setVisible(true);
                    sc27.setFill(Color.web("#bac267"));
                }
                else if (x > 360 && x < 396 && y > 55 && y < 91) {
                    sc28.setVisible(true);
                    sc28.setFill(Color.web("#bac267"));
                }
                else if (x > 11 && x < 47 && y > 105 && y < 141) {
                    sc31.setVisible(true);
                    sc31.setFill(Color.web("#bac267"));
                }
                else if (x > 98 && x < 62 && y > 105 && y < 141) {
                    sc32.setVisible(true);
                    sc32.setFill(Color.web("#bac267"));
                }
                else if (x > 112 && x < 148 && y > 106 && y < 142) {
                    sc33.setVisible(true);
                    sc33.setFill(Color.web("#bac267"));
                }
                else if (x > 161 && x < 197 && y > 106 && y < 142) {
                    sc34.setVisible(true);
                    sc34.setFill(Color.web("#bac267"));

                }
                else if (x > 212 && x < 248 && y > 106 && y < 142) {
                    sc35.setVisible(true);
                    sc35.setFill(Color.web("#bac267"));

                }
                else if (x > 262 && x < 298 && y > 106 && y < 142) {
                    sc36.setVisible(true);
                    sc36.setFill(Color.web("#bac267"));
                }
                else if (x > 312 && x < 348 && y > 106 && y < 142) {
                    sc37.setVisible(true);
                    sc37.setFill(Color.web("#bac267"));
                }
                else if (x > 360 && x < 396 && y > 106 && y < 142) {
                    sc38.setVisible(true);
                    sc38.setFill(Color.web("#bac267"));

                }

                else if (x > 11 && x < 47 && y > 155 && y < 191) {
                    sc41.setVisible(true);
                    sc41.setFill(Color.web("#bac267"));
                }
                else if (x > 62 && x < 98 && y > 155 && y < 191) {
                    sc42.setVisible(true);
                    sc42.setFill(Color.web("#bac267"));
                }

                else if (x > 112 && x < 148 && y > 156 && y < 192) {
                    sc43.setVisible(true);
                    sc43.setFill(Color.web("#bac267"));
                }
                else if (x > 161 && x < 197 && y > 156 && y < 192) {
                    sc44.setVisible(true);
                    sc44.setFill(Color.web("#bac267"));
                }
                else if (x > 212 && x < 248 && y > 156 && y < 192) {
                    sc45.setVisible(true);
                    sc45.setFill(Color.web("#bac267"));
                }
                else if (x > 262 && x < 298 && y > 156 && y < 192) {
                    sc46.setVisible(true);
                    sc46.setFill(Color.web("#bac267"));
                }
                else if (x > 312 && x < 348 && y > 156 && y < 192) {
                    sc47.setVisible(true);
                    sc47.setFill(Color.web("#bac267"));
                }
                else if (x > 360 && x < 396 && y > 156 && y < 192) {
                    sc48.setVisible(true);
                    sc48.setFill(Color.web("#bac267"));
                }
                else if (x > 11 && x < 47 && y > 206 && y < 242) {
                    sc51.setVisible(true);
                    sc51.setFill(Color.web("#bac267"));
                }
                else if (x > 62 && x < 98 && y > 205 && y < 241) {
                    sc52.setVisible(true);
                    sc52.setFill(Color.web("#bac267"));
                }
                else if (x > 112 && x < 148 && y > 206 && y < 242) {
                    sc53.setVisible(true);
                    sc53.setFill(Color.web("#bac267"));

                }

                else if (x > 161 && x < 197 && y > 205 && y < 241) {
                    sc54.setVisible(true);
                    sc54.setFill(Color.web("#bac267"));
                }
                else if (x > 212 && x < 248 && y > 205 && y < 241) {
                    sc55.setVisible(true);
                    sc55.setFill(Color.web("#bac267"));
                }
                else if (x > 262 && x < 298 && y > 205 && y < 241) {
                    sc56.setVisible(true);
                    sc56.setFill(Color.web("#bac267"));
                }
                else if (x > 312 && x < 348 && y > 205 && y < 241) {
                    sc57.setVisible(true);
                    sc57.setFill(Color.web("#bac267"));
                }
                else if (x > 360 && x < 396 && y > 205 && y < 241) {
                    sc58.setVisible(true);
                    sc58.setFill(Color.web("#bac267"));
                }

                else if (x > 11 && x < 47 && y > 255 && y < 291) {
                    sc61.setVisible(true);
                    sc61.setFill(Color.web("#bac267"));
                }
                else if (x > 62 && x < 98 && y > 255 && y < 291) {
                    sc62.setVisible(true);
                    sc62.setFill(Color.web("#bac267"));
                }
                else if (x > 112 && x < 148 && y > 256 && y < 292) {
                    sc63.setVisible(true);
                    sc63.setFill(Color.web("#bac267"));
                }
                else if (x > 161 && x < 197 && y > 256 && y < 292) {
                    sc64.setVisible(true);
                    sc64.setFill(Color.web("#bac267"));
                }
                else if (x > 212 && x < 248 && y > 256 && y < 292) {
                    sc65.setVisible(true);
                    sc65.setFill(Color.web("#bac267"));
                }
                else if (x > 262 && x < 298 && y > 256 && y < 292) {
                    sc66.setVisible(true);
                    sc66.setFill(Color.web("#bac267"));
                }
                else if (x > 312 && x < 348 && y > 256 && y < 292) {
                    sc67.setVisible(true);
                    sc67.setFill(Color.web("#bac267"));
                }
                else if (x > 360 && x < 396 && y > 256 && y < 292) {
                    sc68.setVisible(true);
                    sc68.setFill(Color.web("#bac267"));
                }
                else if (x > 10 && x < 46 && y > 306 && y < 342) {
                    sc71.setVisible(true);
                    sc71.setFill(Color.web("#bac267"));
                }
                else if (x > 61 && x < 97 && y > 305 && y < 341) {
                    sc72.setVisible(true);
                    sc72.setFill(Color.web("#bac267"));
                }
                else if (x > 111 && x < 147 && y > 306 && y < 342) {
                    sc73.setVisible(true);
                    sc73.setFill(Color.web("#bac267"));
                }
                else if (x > 160 && x < 196 && y > 306 && y < 342) {
                    sc74.setVisible(true);
                    sc74.setFill(Color.web("#bac267"));
                }

                else if (x > 211 && x < 247 && y > 306 && y < 342) {
                    sc75.setVisible(true);
                    sc75.setFill(Color.web("#bac267"));
                }
                else if (x > 261 && x < 297 && y > 306 && y < 342) {
                    sc76.setVisible(true);
                    sc76.setFill(Color.web("#bac267"));
                }
                else if (x > 311 && x < 347 && y > 306 && y < 342) {
                    sc77.setVisible(true);
                    sc77.setFill(Color.web("#bac267"));
                }
                else if (x > 359 && x < 395 && y > 306 && y < 342) {
                    sc78.setVisible(true);
                    sc78.setFill(Color.web("#bac267"));
                }
                else if (x > 11 && x < 47 && y > 355 && y < 391) {
                    sc81.setVisible(true);
                    sc81.setFill(Color.web("#bac267"));

                }

                else if (x > 61 && x < 97 && y > 356 && y < 392) {
                    sc82.setVisible(true);
                    sc82.setFill(Color.web("#bac267"));
                }

                else if (x > 111 && x < 147 && y > 356 && y < 392) {
                    sc83.setVisible(true);
                    sc83.setFill(Color.web("#bac267"));
                }
                else if (x > 159 && x < 195 && y > 356 && y < 392) {
                    sc84.setVisible(true);
                    sc84.setFill(Color.web("#bac267"));
                }
                else if (x > 211 && x < 247 && y > 356 && y < 392) {
                    sc85.setVisible(true);
                    sc85.setFill(Color.web("#bac267"));
                }
                else if (x > 261 && x < 297 && y > 356 && y < 392) {
                    sc86.setVisible(true);
                    sc86.setFill(Color.web("#bac267"));
                }
                else if (x > 312 && x < 348 && y > 356 && y < 392) {
                    sc87.setVisible(true);
                    sc87.setFill(Color.web("#bac267"));
                }
                else if (x > 360 && x < 396 && y > 356 && y < 392) {
                    sc88.setVisible(true);
                    sc88.setFill(Color.web("#bac267"));
                }
                isSecondCircle = true;
            }
            //else dovmi commands for second circles and lines
            else {
                double x1=selectedC.get(0).getCenterX();
                double y1=selectedC.get(0).getCenterY();
                if (x > 11 && x < 47 && y > 4 && y < 40) {
                    sc11.setVisible(true);
                    sc11.setFill(Color.web("#bac267"));
                            if (x1 ==اixe markaze y1==y e makraze){
                                sc12.setVisible(true);
                                hl11.setVisible(true);
                                sc12.setFill(Color.web("#bac267"));
                                hl11.setFill(Color.web("98c4c0"));
                            }
                            else if (x > 11 && x < 47 && y > 55 && y < 91){
                                sc21.setVisible(true);
                                vl11.setVisible(true);
                                sc21.setFill(Color.web("#bac267"));
                                vl11.setFill(Color.web("98c4c0"));
                            }

                } else if (x > 62 && x < 98 && y > 4 && y < 40) {
                    sc12.setVisible(true);
                    sc12.setFill(Color.web("#bac267"));
                }

                else if (x > 112 && x < 148 && y > 5 && y < 41) {
                    sc13.setVisible(true);
                    sc13.setFill(Color.web("#bac267"));
                }
                else if (x > 161 && x < 197 && y > 5 && y < 41) {
                    sc14.setVisible(true);
                    sc14.setFill(Color.web("#bac267"));
                }

                else if (x > 212 && x < 248 && y > 5 && y < 41) {
                    sc15.setVisible(true);
                    sc15.setFill(Color.web("#bac267"));
                }

                else if (x > 262 && x < 298 && y > 5 && y < 41) {
                    sc16.setVisible(true);
                    sc16.setFill(Color.web("#bac267"));
                }
                else if (x > 312 && x < 348 && y > 5 && y < 41) {
                    sc17.setVisible(true);
                    sc17.setFill(Color.web("#bac267"));
                }
                else if (x > 360 && x < 396 && y > 5 && y < 41) {
                    sc18.setVisible(true);
                    sc18.setFill(Color.web("#bac267"));
                }
                else if (x > 11 && x < 47 && y > 55 && y < 91) {
                    sc21.setVisible(true);
                    sc21.setFill(Color.web("#bac267"));
                }
                else if (x > 98 && x < 62 && y > 55 && y < 91) {
                    sc22.setVisible(true);
                    sc22.setFill(Color.web("#bac267"));
                }
                else if (x > 148 && x < 112 && y > 55 && y < 91) {
                    sc23.setVisible(true);
                    sc23.setFill(Color.web("#bac267"));
                }
                else if (x > 197 && x < 161 && y > 55 && y < 91) {
                    sc24.setVisible(true);
                    sc24.setFill(Color.web("#bac267"));
                }
                else if (x > 248 && x < 212 && y > 55 && y < 91) {
                    sc25.setVisible(true);
                    sc25.setFill(Color.web("#bac267"));
                }
                else if (x > 298 && x < 262 && y > 55 && y < 91) {
                    sc26.setVisible(true);
                    sc26.setFill(Color.web("#bac267"));
                }
                else if (x > 348 && x < 312 && y > 55 && y < 91) {
                    sc27.setVisible(true);
                    sc27.setFill(Color.web("#bac267"));
                }
                else if (x > 360 && x < 396 && y > 55 && y < 91) {
                    sc28.setVisible(true);
                    sc28.setFill(Color.web("#bac267"));
                }
                else if (x > 11 && x < 47 && y > 105 && y < 141) {
                    sc31.setVisible(true);
                    sc31.setFill(Color.web("#bac267"));
                }
                else if (x > 98 && x < 62 && y > 105 && y < 141) {
                    sc32.setVisible(true);
                    sc32.setFill(Color.web("#bac267"));
                }
                else if (x > 112 && x < 148 && y > 106 && y < 142) {
                    sc33.setVisible(true);
                    sc33.setFill(Color.web("#bac267"));
                }
                else if (x > 161 && x < 197 && y > 106 && y < 142) {
                    sc34.setVisible(true);
                    sc34.setFill(Color.web("#bac267"));

                }
                else if (x > 212 && x < 248 && y > 106 && y < 142) {
                    sc35.setVisible(true);
                    sc35.setFill(Color.web("#bac267"));

                }
                else if (x > 262 && x < 298 && y > 106 && y < 142) {
                    sc36.setVisible(true);
                    sc36.setFill(Color.web("#bac267"));
                }
                else if (x > 312 && x < 348 && y > 106 && y < 142) {
                    sc37.setVisible(true);
                    sc37.setFill(Color.web("#bac267"));
                }
                else if (x > 360 && x < 396 && y > 106 && y < 142) {
                    sc38.setVisible(true);
                    sc38.setFill(Color.web("#bac267"));

                }

                else if (x > 11 && x < 47 && y > 155 && y < 191) {
                    sc41.setVisible(true);
                    sc41.setFill(Color.web("#bac267"));
                }
                else if (x > 62 && x < 98 && y > 155 && y < 191) {
                    sc42.setVisible(true);
                    sc42.setFill(Color.web("#bac267"));
                }

                else if (x > 112 && x < 148 && y > 156 && y < 192) {
                    sc43.setVisible(true);
                    sc43.setFill(Color.web("#bac267"));
                }
                else if (x > 161 && x < 197 && y > 156 && y < 192) {
                    sc44.setVisible(true);
                    sc44.setFill(Color.web("#bac267"));
                }
                else if (x > 212 && x < 248 && y > 156 && y < 192) {
                    sc45.setVisible(true);
                    sc45.setFill(Color.web("#bac267"));
                }
                else if (x > 262 && x < 298 && y > 156 && y < 192) {
                    sc46.setVisible(true);
                    sc46.setFill(Color.web("#bac267"));
                }
                else if (x > 312 && x < 348 && y > 156 && y < 192) {
                    sc47.setVisible(true);
                    sc47.setFill(Color.web("#bac267"));
                }
                else if (x > 360 && x < 396 && y > 156 && y < 192) {
                    sc48.setVisible(true);
                    sc48.setFill(Color.web("#bac267"));
                }
                else if (x > 11 && x < 47 && y > 206 && y < 242) {
                    sc51.setVisible(true);
                    sc51.setFill(Color.web("#bac267"));
                }
                else if (x > 62 && x < 98 && y > 205 && y < 241) {
                    sc52.setVisible(true);
                    sc52.setFill(Color.web("#bac267"));
                }
                else if (x > 112 && x < 148 && y > 206 && y < 242) {
                    sc53.setVisible(true);
                    sc53.setFill(Color.web("#bac267"));
                }

                else if (x > 161 && x < 197 && y > 205 && y < 241) {
                    sc54.setVisible(true);
                    sc54.setFill(Color.web("#bac267"));
                }
                else if (x > 212 && x < 248 && y > 205 && y < 241) {
                    sc55.setVisible(true);
                    sc55.setFill(Color.web("#bac267"));
                }
                else if (x > 262 && x < 298 && y > 205 && y < 241) {
                    sc56.setVisible(true);
                    sc56.setFill(Color.web("#bac267"));
                }
                else if (x > 312 && x < 348 && y > 205 && y < 241) {
                    sc57.setVisible(true);
                    sc57.setFill(Color.web("#bac267"));
                }
                else if (x > 360 && x < 396 && y > 205 && y < 241) {
                    sc58.setVisible(true);
                    sc58.setFill(Color.web("#bac267"));
                }

                else if (x > 11 && x < 47 && y > 255 && y < 291) {
                    sc61.setVisible(true);
                    sc61.setFill(Color.web("#bac267"));
                }
                else if (x > 62 && x < 98 && y > 255 && y < 291) {
                    sc62.setVisible(true);
                    sc62.setFill(Color.web("#bac267"));
                }
                else if (x > 112 && x < 148 && y > 256 && y < 292) {
                    sc63.setVisible(true);
                    sc63.setFill(Color.web("#bac267"));
                }
                else if (x > 161 && x < 197 && y > 256 && y < 292) {
                    sc64.setVisible(true);
                    sc64.setFill(Color.web("#bac267"));
                }
                else if (x > 212 && x < 248 && y > 256 && y < 292) {
                    sc65.setVisible(true);
                    sc65.setFill(Color.web("#bac267"));
                }
                else if (x > 262 && x < 298 && y > 256 && y < 292) {
                    sc66.setVisible(true);
                    sc66.setFill(Color.web("#bac267"));
                }
                else if (x > 312 && x < 348 && y > 256 && y < 292) {
                    sc67.setVisible(true);
                    sc67.setFill(Color.web("#bac267"));
                }
                else if (x > 360 && x < 396 && y > 256 && y < 292) {
                    sc68.setVisible(true);
                    sc68.setFill(Color.web("#bac267"));
                }
                else if (x > 10 && x < 46 && y > 306 && y < 342) {
                    sc71.setVisible(true);
                    sc71.setFill(Color.web("#bac267"));
                }
                else if (x > 61 && x < 97 && y > 305 && y < 341) {
                    sc72.setVisible(true);
                    sc72.setFill(Color.web("#bac267"));
                }
                else if (x > 111 && x < 147 && y > 306 && y < 342) {
                    sc73.setVisible(true);
                    sc73.setFill(Color.web("#bac267"));
                }
                else if (x > 160 && x < 196 && y > 306 && y < 342) {
                    sc74.setVisible(true);
                    sc74.setFill(Color.web("#bac267"));
                }

                else if (x > 211 && x < 247 && y > 306 && y < 342) {
                    sc75.setVisible(true);
                    sc75.setFill(Color.web("#bac267"));
                }
                else if (x > 261 && x < 297 && y > 306 && y < 342) {
                    sc76.setVisible(true);
                    sc76.setFill(Color.web("#bac267"));
                }
                else if (x > 311 && x < 347 && y > 306 && y < 342) {
                    sc77.setVisible(true);
                    sc77.setFill(Color.web("#bac267"));
                }
                else if (x > 359 && x < 395 && y > 306 && y < 342) {
                    sc78.setVisible(true);
                    sc78.setFill(Color.web("#bac267"));
                }
                else if (x > 11 && x < 47 && y > 355 && y < 391) {
                    sc81.setVisible(true);
                    sc81.setFill(Color.web("#bac267"));
                    isSecondCircle = true;
                }

                else if (x > 61 && x < 97 && y > 356 && y < 392) {
                    sc82.setVisible(true);
                    sc82.setFill(Color.web("#bac267"));
                }

                else if (x > 111 && x < 147 && y > 356 && y < 392) {
                    sc83.setVisible(true);
                    sc83.setFill(Color.web("#bac267"));
                }

                else if (x > 159 && x < 195 && y > 356 && y < 392) {
                    sc84.setVisible(true);
                    sc84.setFill(Color.web("#bac267"));
                }


                else if (x > 211 && x < 247 && y > 356 && y < 392) {
                    sc85.setVisible(true);
                    sc85.setFill(Color.web("#bac267"));
                }
                else if (x > 261 && x < 297 && y > 356 && y < 392) {
                    sc86.setVisible(true);
                    sc86.setFill(Color.web("#bac267"));
                }
                else if (x > 312 && x < 348 && y > 356 && y < 392) {
                    sc87.setVisible(true);
                    sc87.setFill(Color.web("#bac267"));
                }
                else if (x > 360 && x < 396 && y > 356 && y < 392) {
                    sc88.setVisible(true);
                    sc88.setFill(Color.web("#bac267"));
                }
                isSecondCircle = false;
            }

        }
        //commands for second player
        else {

        }

    }*/}