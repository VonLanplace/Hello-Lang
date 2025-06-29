use std::io;
/*
> |   - |  Venda Mensal   | Preço Atual  | Preço Novo |
> | --: | :-------------: | :----------: | :--------: |
> |  A) |      < 500      |     < 30     |   + 10%    |
> |  B) | >= 500 e < 1000 | >= 30 e < 80 |    +15%    |
> |  C) |     >= 1000     |    >= 80     |    - 5%    |
*/
fn main() {
    let mensal = input_f64("Insira o numero de vendas Mensais: ");
    let atual = input_f64("Insira o preço atual: ");
    let novo;
    if mensal < 500.0 && atual < 30.0 {
        novo = atual * 1.1;
    } else if mensal >= 500.0 && mensal < 1000.0 && atual >= 30.0 && atual < 80.0 {
        novo = atual * 1.15;
    } else if mensal >= 1000.0 && atual >= 80.0 {
        novo = atual * 0.95;
    } else {
        novo = atual;
    }
    println!("O novo valor é {:.2}R$", novo);
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
