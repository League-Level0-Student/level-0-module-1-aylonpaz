 PImage pepperoni;
PImage olive;
PImage mushroom;
void setup() {
    size(300,300);
    pepperoni = loadImage("pepperoni.png");
    olive = loadImage("olive.png");
    mushroom = loadImage("mushroom.png");
    pepperoni.resize(30, 30);
    olive.resize(30,30);
    mushroom.resize(30,30);
}
void draw() {
    fill(214,200,45);
    ellipse(150,150,300,300);
    fill(#E04130);
    ellipse(150,150,275,275);
    fill(#E1E82C);
    ellipse(150,150,270,270);
    if(mousePressed){
   image(pepperoni,100,100);
   image(olive,120,120);
   image(pepperoni,150,111);
   image(pepperoni,150,150);
   image(olive,160,170);
   image(pepperoni,200,200);
   image(mushroom,210,210);
   image(mushroom,40,50);
   image(mushroom,50,200);
    }
}
