use std::time::{SystemTime, UNIX_EPOCH};

fn main() {
    let mut matriz = [[0; 8]; 8];
    let mut vetor = [0; 7];
    for i in 0..matriz.len() {
        for j in 0..matriz[i].len() {
            let mut aux;
            loop {
                aux = simple_random();
                if aux > 0 {
                    break;
                }
            }
            matriz[i][j] = aux;
            vetor[(matriz[i][j] - 1) as usize] += 1;
        }
    }
    for line in &matriz {
        println!("{:?}", line);
    }
    println!("as peças são :\n{:2.?}", vetor);
}

fn simple_random() -> i32 {
    let seed = SystemTime::now()
        .duration_since(UNIX_EPOCH)
        .unwrap()
        .as_nanos() as u32; // Convert time to a u32 seed

    // A very basic pseudo-random generator (LCG)
    let mut rng = seed;
    rng = rng.wrapping_mul(1664525).wrapping_add(1013904223);
    (rng % 8) as i32
}
