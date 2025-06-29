use std::io;

fn main() {
    let mut matriz = [[0; 4]; 3];
    for i in 0..matriz.len() {
        for j in 0..matriz[i].len() {
            matriz[i][j] = input_i32("Insira o numero de vendas do produto na semana.");
        }
    }
    //ler coluna
    let mut resposta;
    for j in 0..matriz[0].len() {
        resposta = 0;
        for i in 0..matriz.len() {
            resposta += matriz[i][j];
        }
        println!(
            "A quantidade do produtos {} vendidos no mês é {}.",
            j + 1,
            resposta
        );
    }
    //ler linha
    for i in 0..matriz.len() {
        resposta = 0;
        for j in 0..matriz[i].len() {
            resposta += matriz[i][j];
        }
        println!(
            "A quantidade do produtos vendidos na semana {} é {}.",
            i + 1,
            resposta
        );
    }
    //ler total
    resposta = 0;
    for i in 0..matriz.len() {
        for j in 0..matriz[i].len() {
            resposta += matriz[i][j];
        }
    }
    println!("O total de produtos vendidos é {}.", resposta);
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
