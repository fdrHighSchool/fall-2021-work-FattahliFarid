function setup() {
  createCanvas(400, 400);
}

function draw() {
  background(0,0,0);
  noStroke();
  fill(255);
ellipse(width/2,height/3,115,90);
ellipse(width/2,height/2.38,105,65);

  fill(0,0,0);
ellipse(width/2.4,height/2.9,30,20);
ellipse(width/1.7,height/2.9,30,20);

  fill(255);
circle(width/1.73,height/2.88,7,20);
circle(width/2.35,height/2.88,7,20);

  fill(0,0,0)
square(190,149,20);
square(195,139,10);

  stroke(0,0,0);
strokeWeight(3);
fill(255)
arc(200, 175, 80, 30, PI/0.5, PI,CHORD);


  line(170, 185, 170,175);
line(188, 190, 188,175);
line(200, 190, 200,175);
line(215, 187, 215,175);
line(222, 185, 222,175);
strokeWeight(7);
line(235.5, 180, 226.5,182);
line(235, 175, 225,177);
}
