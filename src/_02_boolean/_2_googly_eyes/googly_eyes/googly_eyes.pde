 PImage face;
void setup() {
     face = loadImage("maxresdefault.jpg");
  size(800,600);
   
   face.resize(width,height);

   
}

void draw() {
  background(face);
fill(102,0,0);
ellipse(mouseX,mouseY,10,30);
fill(102,0,0);
ellipse(mouseX + 300, mouseY - 70,10,30);
//println(mouseX + " " + mouseY);
if(mouseX > 280) {
  mouseX = 280;
}
else if(mouseX < 190) {
  mouseX = 190;
}
if(mouseY < 220) {
  mouseY = 220;
}
else if (mouseY > 320) {
  mouseY =320;
}
}
