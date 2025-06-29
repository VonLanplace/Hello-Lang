use std::time::{SystemTime, UNIX_EPOCH};

fn main() {
    let mut vetor = [0; 30];
    let media;
    let acima;
    let mut abaixo = vec![];
    //Calc media
    {
        let mut soma = 0;
        for i in 0..vetor.len() {
            vetor[i] = simple_random() % 101;
            soma += vetor[i];
        }
        media = soma as u32 / vetor.len() as u32;
        let mut aux = 0;
        for i in 0..vetor.len() {
            if vetor[i] > media {
                aux += 1;
            }
            if vetor[i] < media {
                abaixo.push(i as i32);
            }
        }
        acima = aux;
    }
    println!("O Vetor é {:?}", vetor);
    println!("A média dos grupos é {:.2}.", media);
    println!("A quantidade de valores acima da média é {}.", acima);
    println!("As posições de valores abaixo da média é {:?}.", abaixo);
}

fn simple_random() -> u32 {
    let seed = SystemTime::now()
        .duration_since(UNIX_EPOCH)
        .unwrap()
        .as_nanos() as u32; // Convert time to a u32 seed

    // A very basic pseudo-random generator (LCG)
    let mut rng = seed;
    rng = rng.wrapping_mul(1664525).wrapping_add(1013904223);
    rng
}
