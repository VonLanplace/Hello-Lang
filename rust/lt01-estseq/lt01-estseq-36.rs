use std::io;

fn main() {
    let num = input_f64("Insira o numero N: ");
    println!(
        "O valor da serie com {:.0} termos é {:.2}.",
        num,
        serie(num)
    );
}

fn serie(mut num: f64) -> f64 {
    let mut serie = 0.0;
    while num > 0.0 {
        serie += 1.0 / fat(num);
        num -= 1.0;
    }
    return serie;
}

fn fat(mut num: f64) -> f64 {
    let mut fat = num;
    while num > 1.0 {
        num -= 1.0;
        fat *= num;
    }
    return fat;
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
