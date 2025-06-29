use std::io;

fn main() {
    //input of axx
    let axx;
    loop {
        let x = input_f64("Insira o valor de ax^2: ");
        if x > 0.0 {
            axx = x;
            break;
        }
    }
    //Input bx , c
    let bx = input_f64("Insira o valor de bx: ");
    let c = input_f64("Insira o valor de c: ");
    let delta = (bx * bx) - (4.0 * axx * c);
    //begin
    if delta == 0.0 {
        println!("O valor da raiz é {:.2}.", (-bx) / (2.0 * axx));
    } else if delta > 0.0 {
        println!(
            "O valor da primeira raiz é {:.2}.",
            (-bx + delta.sqrt()) / (2.0 * axx)
        );
        println!(
            "O valor da segunda raiz é {:.2}.",
            (-bx - delta.sqrt()) / (2.0 * axx)
        );
    } else {
        println!("Não existe raiz real.");
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
