use std::io;

fn main() {
    let mut vector = [0; 50];
    let mut media = 0;
    let mut soma = 0;
    let mut j = 0;
    for i in 0..vector.len() {
        vector[i] = input_i32("Insira um númeor inteiro: ");
        if vector[i] % 2 == 1 {
            soma += vector[i];
        }
        if 10 < vector[i] && vector[i] < 200 {
            media += vector[i];
            j += 1;
        }
    }
    if j > 0 {
        media /= j;
    }
    println!("A média dos valores entre 10 e 200 é {}.", media);
    println!("A soma dos numeros ínpares é {}.", soma);
}

fn input_i32(texto: &str) -> i32 {
    let int: i32;
    loop {
        println!("{}", texto);
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Error read_line");
        int = match input.trim().parse() {
            Ok(n) => {
                if n >= 0 {
                    n
                } else {
                    println!("Valor inválido!");
                    continue;
                }
            }
            Err(_) => {
                println!("Valor inválido!");
                continue;
            }
        };
        return int;
    }
}
