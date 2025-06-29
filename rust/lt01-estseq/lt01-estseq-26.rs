use std::io;

fn main() {
    let num1 = input_i32("Insira um valor inteiro: ");
    let num2 = input_i32("Insira um valor inteiro: ");
    if num1 > num2 {
        resp(num1, num2);
    } else if num2 > num1 {
        resp(num2, num1);
    } else {
        println!("Os valores são iguais!");
    }
}

fn resp(maior: i32, menor: i32) {
    if maior % menor == 0 {
        println!("O valor {} é multiplo de {}.", maior, menor);
    } else {
        println!("O valor {} não é multiplo de {}.", maior, menor);
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
