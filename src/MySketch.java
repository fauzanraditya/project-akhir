/*
 * Fauzan Raditya Irawan - 235150401111069
 * M Takhta Ali Sulthon - 235150400111055
 * 
 * Sistem Informasi - E
 */


import processing.core.PApplet;

public class MySketch extends PApplet {

    float ye = 90;
    float xe = 0;
    boolean siang = true;

    public static void main(String[] args) {
        MySketch mySketch = new MySketch();
        PApplet.runSketch(new String[] { "Hello Processing" }, mySketch);
    }

    @Override
    public void settings() {
        size(808, 550);

    }

    @Override
    public void draw() {

        if (siang == true) {
            background(25, 25, 255);
            langitSiang();
            // background(78,155,17);
            fill(255, 255, 0);
            ellipse(xe += 10, ye, 75, 75);
            if (xe > 725) {
                siang = false;
                xe = 0;
            }
        } else if (siang == false) {
            background(25, 25, 112);
            langitMalam();
            fill(128, 128, 128);
            ellipse(xe += 10, ye, 75, 75);
            if (xe > 725) {
                siang = true;
                xe = 0;
            }
        }
        delay(500);
        gunung();
        jalan();
        lahan();
        rumah();
        mobil();
        hujan();
        awan();
        dinding();
        lantai();
        atap();
        jendela();
        meja();
        buku();
        komputer();
        cpuKomputer();
        lampu();
        jam();
    }

    public void langitSiang() {
        noStroke();
        fill(30, 30, 250);
        rect(10, 150, 500, 10);
        fill(40, 40, 255);
        rect(10, 160, 500, 10);
        fill(50, 50, 255);
        rect(10, 170, 500, 10);
        fill(60, 60, 255);
        rect(10, 180, 500, 10);
        fill(70, 70, 255);
        rect(10, 190, 500, 10);
        fill(80, 80, 255);
        rect(10, 200, 500, 10);
        fill(90, 90, 255);
        rect(10, 210, 500, 10);
        fill(100, 100, 255);
        rect(10, 220, 500, 10);
        fill(110, 110, 255);
        rect(10, 230, 500, 10);
    }

    public void langitMalam() {
        noStroke();
        fill(25, 25, 120);
        rect(10, 150, 500, 10);
        fill(25, 25, 125);
        rect(10, 160, 500, 10);
        fill(25, 25, 135);
        rect(10, 170, 500, 10);
        fill(25, 25, 145);
        rect(10, 180, 500, 10);
        fill(25, 25, 155);
        rect(10, 190, 500, 10);
        fill(25, 25, 165);
        rect(10, 200, 500, 10);
        fill(25, 25, 175);
        rect(10, 210, 500, 10);
        fill(25, 25, 185);
        rect(10, 220, 500, 10);
        fill(25, 25, 195);
        rect(10, 230, 500, 10);
    }

    public void gunung() {
        // Gunung

        strokeWeight(3);
        fill(0, 94, 0);
        arc(130, 330, 400, 230, (180 * PI) / 180, (360 * PI) / 180);
        fill(0, 132, 0);
        arc(320, 330, 400, 230, (180 * PI) / 180, (360 * PI) / 180);

    }

    public void jalan() {
        // Jalan
        noStroke();
        fill(0);
        quad(0, 380, 380, 380, 380, 440, 0, 440);
        strokeWeight(4);
        stroke(255);
        line(20, 405, 48, 405);
        line(60, 405, 88, 405);
        line(100, 405, 128, 405);
        line(140, 405, 168, 405);
        line(180, 405, 208, 405);
        line(220, 405, 248, 405);
        line(260, 405, 288, 405);
        line(300, 405, 328, 405);
        line(340, 405, 368, 405);
        line(380, 405, 408, 405);
        line(420, 405, 448, 405);
    }

    public void lahan() {
        // Lahan
        noStroke();
        fill(80, 49, 33);
        quad(0, 330, 388, 330, 380, 380, 0, 380);
    }

    public void rumah() {
        // Rumah
        noStroke();
        fill(125, 87, 46);
        triangle(55, 323, 23, 345, 87, 345);
        fill(182, 181, 216);
        rect(30, 345, 48, 28);

        fill(125, 87, 46);
        triangle(120, 320, 90, 340, 150, 340);
        fill(255, 255, 0);
        rect(100, 340, 40, 20);
    }

    public void mobil() {
        int second = second();

        // Mobil
        fill(104, 105, 188);
        rect(20 + 10 * second, 350, 108, 58);
        // fill(124, 282, 8);
        // rect(128 + 10 * second, 265, 48, 35);
        fill(94, 85, 188);
        rect(128 + 10 * second, 373, 20, 35);
        fill(65);
        ellipse(45 + 10 * second, 400, 30, 30);
        ellipse(105 + 10 * second, 400, 30, 30);
    }

    public void hujan() {
        int y = 10;

        // Hujan
        if (y > 1000) {
            y = 10;
        }
        for (int i = 0; i < 1500; i += 575) {
            fill(255, 255, 255);
            ellipse(random(1, 1500), y += random(1, 100), 1, 50);
            ellipse(random(1, 1500), y += random(-50, 100), 1, 50);
            ellipse(random(1, 1500), y += random(-100, 100), 1, 50);
        }

    }

    public void dinding() {
        // Dinding
        strokeWeight(8);
        noStroke();
        fill(168, 208, 218);
        quad(0, 8, 480, 8, 480, 40, 0, 48);
        quad(370, 0, 808, 0, 808, 450, 370, 450);
        quad(0, 440, 389, 440, 380, 458, 0, 458);
        quad(0, 0, 0, 450, 20, 450, 20, 0);
    }

    public void lantai() {
        // lantai
        fill(250, 250, 200);
        quad(0, 450, 820, 450, 820, 550, 0, 550);
        stroke(0);
        strokeWeight(3);
        line(0, 450, 820, 450);
        line(0, 500, 820, 500);
        line(10, 450, -50, 550);
        line(100, 450, 50, 550);
        line(200, 450, 150, 550);
        line(300, 450, 250, 550);
        line(400, 450, 350, 550);
        line(500, 450, 450, 550);
        line(600, 450, 550, 550);
        line(700, 450, 650, 550);
        line(800, 450, 750, 550);
    }

    public void atap() {
        // list
        stroke(0);
        strokeWeight(2);
        fill(255);
        quad(0, 0, 820, 0, 820, 30, 0, 30);
        line(0, 25, 820, 25);
    }

    public void jendela() {
        // jendela
        strokeWeight(0);
        fill(189, 138, 63);
        quad(10, 40, 380, 40, 380, 70, 10, 70);
        quad(10, 440, 380, 440, 380, 430, 10, 430);
        strokeWeight(4);
        line(10, 50, 380, 50);
        line(10, 60, 380, 60);
        quad(10, 40, 20, 40, 20, 440, 10, 440);
        quad(370, 40, 380, 40, 380, 440, 370, 440);
        quad(190, 40, 200, 40, 200, 440, 190, 440);
    }

    public void meja() {
        // meja
        strokeWeight(1);
        fill(159, 89, 0);
        quad(430, 305, 780, 305, 780, 320, 430, 320);
        rect(550, 320, 230, 100);
        rect(440, 320, 130, 129);
        // quad(780, 300, 440, 300, 440, 450, 430, 450);
        quad(780, 300, 790, 300, 790, 450, 780, 450);
        strokeWeight(1);
        line(665, 320, 665, 420);
        fill(0);
        strokeWeight(9);
        point(655, 370);
        point(675, 370);
        point(550, 390);
    }

    public void buku() {
        // buku
        strokeWeight(0);
        fill(255, 255, 255);
        quad(690, 290, 770, 290, 770, 305, 690, 305);
        line(691, 293, 770, 293);
        line(691, 296, 770, 296);
        line(691, 299, 770, 299);
        line(691, 301, 770, 301);
        strokeWeight(3);
        stroke(0, 79, 0);
        line(691, 290, 691, 303);
        line(691, 290, 771, 290);
        line(691, 303, 771, 303);

        strokeWeight(0);
        fill(255);
        quad(695, 270, 765, 270, 765, 288, 695, 288);
        line(695, 275, 765, 275);
        line(695, 278, 695, 278);
        line(695, 281, 695, 281);
        strokeWeight(4);
        stroke(3, 20, 141);
        line(694, 286, 694, 270);
        line(694, 286, 765, 286);
        line(694, 270, 765, 270);
    }

    public void komputer() {
        // komputer
        // monitor komputer
        strokeWeight(5);
        stroke(192, 192, 192);
        fill(0);
        beginShape(QUADS);
        vertex(450, 210);
        vertex(550, 210);
        vertex(550, 280);
        vertex(450, 280);
        endShape();
        fill(192, 192, 192);
        quad(480, 300, 520, 300, 520, 302, 480, 302);
        quad(495, 280, 505, 280, 505, 300, 495, 303);
        strokeWeight(0);
        quad(450, 350, 500, 350, 500, 450, 450, 450);

    }

    public void cpuKomputer() {
        int second = second();

        // cpu komputer
        stroke(0);
        line(455, 355, 495, 355);
        line(455, 365, 495, 365);
        line(455, 355, 455, 365);
        line(495, 355, 495, 370);
        ellipse(475, 405, 3, 3);
        ellipse(475, 405, 3, 3);

        fill(255 - 15 * second, 255 - 15 * second, 0 + 15 * second);

        ellipse(475, 390, 15, 15);
        line(455, 425, 495, 425);
        line(455, 435, 495, 435);
        line(455, 445, 495, 445);
    }

    public void lampu() {
        // lampu
        fill(250, 240, 230);
        quad(631, 240, 639, 240, 639, 300, 631, 300);
        quad(615, 298, 655, 298, 655, 305, 615, 305);
        ellipse(635, 215, 35, 25);
        ellipse(635, 230, 65, 45);
        fill(211, 4, 1);
        ellipse(635, 230, 50, 35);
        fill(255, 255, 0);
        ellipse(635, 230, 15, 15);
    }

    public void jam() {
        int second = second();
        int minute = minute();
        int hour = hour();
        // jam
        strokeWeight(3);
        stroke(0);
        fill(249, 19, 147);
        ellipse(600, 90, 75, 75);
        strokeWeight(3);
        point(600, 90);
        line(600, 55, 600, 57);
        line(600, 125, 600, 123);
        line(563, 90, 566, 90);
        line(637, 90, 633, 90);
        stroke(0, 0, 255);
        line(600, 90, cos(second) * 30 + 600, sin(second) * 30 + 90);
        stroke(0);
        line(600, 90, cos(minute) * 25 + 600, sin(minute) * 30 + 90);
        line(600, 90, cos(hour) * 20 + 600, sin(hour) * 20 + 90);
    }

    public void awan() {
        int second = second();
        // Awan
        stroke(0, 0, 0);
        strokeWeight(2);
        fill(95, 158, 160);
        ellipse(-70 + 8 * second, 150, 30, 15);
        ellipse(-40 + 8 * second, 150, 45, 35);
        ellipse(-10 + 8 * second, 150, 30, 15);

        fill(95, 158, 160);
        ellipse(-50 + 8 * second, 120, 30, 10);
        ellipse(-10 + 8 * second, 120, 40, 30);
        ellipse(10 + 8 * second, 120, 28, 18);
    }
}