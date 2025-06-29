use std::io;

fn main() {
    let num = input_i32("Insira um número inteiro: ");
    println!("O fatorial de {} é {}.", num, fat(num));
}
fn fat(mut num: i32) -> i32 {
    let mut fat = num;
    while num > 1 {
        num -= 1;
        fat *= num;
    }
    return fat;
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
