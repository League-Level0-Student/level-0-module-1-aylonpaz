PImage face;
void setup() {
face = loadImage("Zombie.png");
size(700,700);
face.resize(700,700);
}
void draw() {
background(face);
fill(mouseX %150,mouseY %175,50);
ellipse(400,335,200, 200);
ellipse(135,355,115,115);
fill(#000000);
ellipse(135,365,50,50);
ellipse(400,355,50,50);
}
