#include "Convertir.h"

Convertir::Convertir()
{
    //se le asigna por defecto 0 al atributo velocidad
    velocidad = 0;
}

Convertir::~Convertir()
{
    //dtor
}

//Implementacion del metodo para convertir m/s a km/h
float Convertir::kilometrosPorHora()
{
    //la formula es muy sencilla se debe multiplicar la velocidad por 3.6
    return velocidad * 3.6;
}

//Implementacion de los metodos Setters y Getters
void Convertir::setVelocidad(float n)
{
    velocidad = n;
}

float Convertir::getVelocidad()
{
    return velocidad;
}
