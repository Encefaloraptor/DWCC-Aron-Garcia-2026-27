
int suma(int a, int b) {
    return a + b;
}

int main() {
    int a = 2;
    char* b = "3";

    printf("Voy a sumar %d y %s\n", a, b);
    printf("¿debería ser 5?\n");

    printf("%d\n", suma(a, b));

    return 0;
}