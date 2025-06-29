use std::io;

fn main() {
    let num1 = input_i32("Insira o primeiro número: ");
    let num2 = input_i32("Insira o segundo número: ");
    if num1 > num2 {
        println!("O maior valor foi o primeiro {}.", num1);
    } else if num1 < num2 {
        println!("O maior valor foi o segundo {}.", num2);
    } else {
        println!("Os valores são iguais.");
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
