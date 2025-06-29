use std::io;

fn main() {
    let base = input_i32("Insira o valor da base.");
    let expoente = input_i32("Insira o valor do expoente.");
    println!("O valor de {}^{} é {}", base, expoente, pot(base, expoente));
}

fn pot(base: i32, expoente: i32) -> i32 {
    if expoente > 0 {
        return base * pot(base, expoente - 1);
    } else {
        return 1;
    }
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
