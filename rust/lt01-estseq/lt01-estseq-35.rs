use std::io;

fn main() {
    let num1 = input_i32("Insira um número Inteiro: ");
    let num2 = input_i32("Insira um número Inteiro: ");
    if num1 > num2 {
        println!(
            "A somatótia dos valores impares entre {} e {} é {}.",
            num1,
            num2,
            calc(num1, num2)
        );
    } else {
        println!(
            "A somatótia dos valores impares entre {} e {} é {}.",
            num2,
            num1,
            calc(num2, num1)
        );
    }
}
fn calc(maior: i32, menor: i32) -> i32 {
    let mut soma = 0;
    for i in (menor + 1)..maior {
        if i % 2 == 1 {
            soma += i;
        }
    }
    return soma;
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
