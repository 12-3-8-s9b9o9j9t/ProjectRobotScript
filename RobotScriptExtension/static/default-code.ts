export const defaultCode = `
// Welcome to RobotSript!

// This is the start of your program
void main() {
    // Write your code here
    Speed = 100;

    number nbSquares = 3;
    number dist = 30;

    while (nbSquares > 0) {
        square(dist);
        nbSquares -= 1;
        dist *= 2;
    }
}

// You can also define functions here

void square(number dist) {
    number repeat = 4;
    while (repeat > 0) {
        Forward dist;
        Rotate 90;
        repeat -= 1;
    }
}

`.trimStart();