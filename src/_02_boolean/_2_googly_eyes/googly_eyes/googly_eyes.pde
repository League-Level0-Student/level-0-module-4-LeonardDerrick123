 PImage face;
void setup() {
     face = loadImage("maxresdefault.jpg");
  size(800,600);
   
   face.resize(width,height);

   
}

void draw() {
  background(face);
fill(mouseX,0,0);{
ellipse(250,278,10,30);
fill(102,0,0);{
ellipse(500,220,10,30);
}
}
}
