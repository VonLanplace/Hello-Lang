use std::io;

fn main() {
    let num1 = input_f64("Insira um numero:");
    let num2 = input_f64("Insira um numero:");
    let num3 = input_f64("Insira um numero:");
    let num4 = input_f64("Insira um numero:");
    if num1 > num4 {
        println!(
            "Os valores em ordem são 1°-{},2°-{},3°-{},4°-{},",
            num4, num1, num2, num3
        );
    } else if num2 > num4 {
        println!(
            "Os valores em ordem são 1°-{},2°-{},3°-{},4°-{},",
            num1, num4, num2, num3
        );
    } else if num3 > num4 {
        println!(
            "Os valores em ordem são 1°-{},2°-{},3°-{},4°-{},",
            num1, num2, num4, num3
        );
    } else {
        println!(
            "Os valores em ordem são 1°-{},2°-{},3°-{},4°-{},",
            num1, num2, num3, num4
        );
    }
}

fn input_f64(texto: &str) -> f64 {
    let double: f64;
    loop {
        println!("{}", texto);
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Error read_line");
        double = match input.trim().parse() {
            Ok(n) => {
                if n >= 0.0 {
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
        return double;
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
