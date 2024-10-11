package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class App {
    public static void main(String[] args) {
        // Rta al punto 4. a)

        List<Empleado> empleados = Arrays.asList(
                Empleado.builder()
                        .nombre("Ruben")
                        .primerApellido("Gomez")
                        .segundoApellido("Sabio")
                        .genero(Genero.HOMBRE)
                        .departamento(Departamento.INFORMATICA)
                        .salario(2500)
                        .build(),
                Empleado.builder()
                        .nombre("Ivan")
                        .primerApellido("Reina")
                        .segundoApellido("Galvez")
                        .genero(Genero.HOMBRE)
                        .departamento(Departamento.INFORMATICA)
                        .salario(2600)
                        .build(),
                Empleado.builder()
                        .nombre("Marcos")
                        .primerApellido("Perez")
                        .segundoApellido("Serrano")
                        .genero(Genero.HOMBRE)
                        .departamento(Departamento.SISTEMA)
                        .salario(4500)
                        .build(),
                Empleado.builder()
                        .nombre("Juan")
                        .primerApellido("Guerrero")
                        .segundoApellido("Leon")
                        .genero(Genero.HOMBRE)
                        .departamento(Departamento.SISTEMA)
                        .salario(1500.50)
                        .build(),
                Empleado.builder()
                        .nombre("Antoni")
                        .primerApellido("Saez")
                        .segundoApellido("Vagace")
                        .genero(Genero.HOMBRE)
                        .departamento(Departamento.SISTEMA)
                        .salario(4500)
                        .build(),
                Empleado.builder()
                        .nombre("Elli")
                        .primerApellido("Hdez")
                        .segundoApellido("Gmez")
                        .genero(Genero.MUJER)
                        .departamento(Departamento.RRHH)
                        .salario(2500)
                        .build(),
                Empleado.builder()
                        .nombre("Susana")
                        .primerApellido("Gomez")
                        .segundoApellido("Sabio")
                        .genero(Genero.MUJER)
                        .departamento(Departamento.FINANZAS)
                        .salario(3500)
                        .build(),
                Empleado.builder()
                        .nombre("Isabel")
                        .primerApellido("Mtnez")
                        .segundoApellido("Sabio")
                        .genero(Genero.MUJER)
                        .departamento(Departamento.FINANZAS)
                        .salario(4500)
                        .build());

            // 4 b)

            // Calcular el salario promedio

            OptionalDouble salarioPromedioOptional = empleados.stream().mapToDouble(Empleado::getSalario).average();

            final double salarioPromedio = salarioPromedioOptional.getAsDouble();

            empleados.stream()
                .filter(empleado -> empleado.getSalario() > salarioPromedio && 
                            empleado.getGenero().equals(Genero.MUJER))
                .forEach(System.out::println);

            // 5 a) 
            
    }
}
