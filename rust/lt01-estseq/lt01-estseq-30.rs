use std::io;

fn main() {
    // input
    let mut dn = input_i32("Insira a dia de nascimento: ");
    let mn = input_i32("Insira o mês de nascimento: ");
    let an = input_i32("Insira o ano de nascimento: ");
    let mut da = input_i32("Insira a dia de atual: ");
    let mut ma = input_i32("Insira o mês de atual: ");
    let mut aa = input_i32("Insira o ano de atual: ");
    //Calc atual
    da += aa * 365;
    da += (aa / 4) - (aa / 100) + (aa / 400);
    da += mes_dia(ma);
    //Calc nascimento
    dn += an * 365;
    dn += (an / 4) - (an / 100) + (an / 400);
    dn += mes_dia(mn);
    // Calc resulstado
    da -= dn;
    aa = da / 365;
    da %= 365;
    ma = dia_mes(da);
    da -= mes_dia(ma);
    // print
    println!(
        "A Idade da pessoa é {} anos {} messes e {} dias de idade.",
        aa, ma, da
    );
}

fn mes_dia(mes: i32) -> i32 {
    match mes {
        1 => return 0,
        2 => return 31,
        3 => return 90,
        4 => return 120,
        5 => return 151,
        6 => return 181,
        7 => return 212,
        8 => return 243,
        9 => return 273,
        10 => return 304,
        11 => return 334,
        12 => return 365,
        _ => return 0,
    }
}

fn dia_mes(mut dia: i32) -> i32 {
    let mut i = 0;
    loop {
        if i < 7 {
            if i == 1 && dia >= 28 {
                i += 1;
                dia -= 28;
            } else if i % 2 == 0 && dia >= 31 {
                i += 1;
                dia -= 31
            } else if i % 2 == 1 && dia >= 30 {
                i += 1;
                dia -= 30;
            } else {
                return i;
            }
        } else {
            if i % 2 == 0 && dia >= 30 {
                i += 1;
                dia -= 30
            } else if i % 2 == 1 && dia >= 31 {
                i += 1;
                dia -= 31;
            } else {
                return i;
            }
        }
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
