use std::io;

fn main() {
    let mut maior = input_i32("Insira um número Inteiro: ");
    for i in 0..10 {
        let aux = simple_random();
        println!("{}={}", i, aux);
        if aux > maior {
            maior = aux;
        } else if aux < menor {
            menor = aux;
        }
    }
    println!("O maior valor é {} e o menor é {}.", maior, menor);
}

fn input_i32(texto: &str) -> i32 {
    let int: i32;
    loop {
        println!("{}", texto);
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Error read_line");
        int = match input.trim().parse() {
            Ok(n) => n,
            Err(_) => {
                println!("Valor inválido!");
                continue;
            }
        };
        return int;
    }
}
